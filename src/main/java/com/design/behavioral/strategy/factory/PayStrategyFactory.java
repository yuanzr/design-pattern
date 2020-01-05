package com.design.behavioral.strategy.factory;

import com.design.behavioral.strategy.strategy.BasePayStrategy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 勋章策略Factory
 * 实现ApplicationContextAware获取不到bean
 */
@Component
public class PayStrategyFactory implements BeanFactoryAware {

	private static final Map<Byte, BasePayStrategy> strategys = new ConcurrentHashMap<>();

	private BeanFactory beanFactory;


	/**
	 * 获取支付策略
	 * @param code
	 * @return
	 */
	public  BasePayStrategy getStrategy(Byte code) {
		return Optional.ofNullable(strategys.get(code)).orElseGet(() -> {
			Class clazz = PayStrategyFactoryEnum.getClazz(code);
			BasePayStrategy strategy = ((BasePayStrategy)beanFactory.getBean(clazz));
			if(strategy == null) {
				throw new IllegalStateException("Not found the strategy for badgeType: " + code);
			}
			strategys.put(code, strategy);
			return strategy;
		});
	}


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
}
