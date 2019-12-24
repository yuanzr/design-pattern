package com.design.behavioral.strategy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略Factory
 * 实现ApplicationContextAware获取不到bean
 */
@Component
public class StrategyFactory implements BeanFactoryAware {

	private static final Map<Byte, IBaseStrategy> strategys = new ConcurrentHashMap<>();

	private BeanFactory beanFactory;


	/**
	 * 获取执行的策略
	 * @param strategyType
	 * @return
	 */
	public  IBaseStrategy getStrategy(Byte strategyType) {
		return Optional.ofNullable(strategys.get(strategyType)).orElseGet(() -> {
					Map<Byte, Class> allClazz = StrategyEnum.getAllClazz();
					Class clazz = allClazz.get(strategyType);
					IBaseStrategy strategy = ((IBaseStrategy)beanFactory.getBean(clazz));
					if(strategy == null) {
						throw new IllegalStateException("Not found the strategy for strategyType:" + strategyType);
					}
					strategys.put(strategyType, strategy);
					return strategy;
				});
	}


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
}
