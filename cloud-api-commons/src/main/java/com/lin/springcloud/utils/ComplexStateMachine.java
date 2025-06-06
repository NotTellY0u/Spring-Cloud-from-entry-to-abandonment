package com.lin.springcloud.utils;


import java.util.*;


public class ComplexStateMachine {
	private String currentState;
	private static final Map<String, Set<String>> TRANSITION_RULES = new HashMap<>();


	/**
	 * 使用指定的初始状态构造状态机
	 *
	 * @param initialState 初始状态
	 */
	public ComplexStateMachine(String initialState) {
		if (!isValidInitialState(initialState)) {
			throw new IllegalArgumentException("不是有效的初始状态：" + initialState);
		}
		this.currentState = initialState;
	}

	/**
	 * 默认构造函数，初始状态为10
	 */
	public ComplexStateMachine() {
		this("10");
	}

	static {
		TRANSITION_RULES.put("10", new HashSet<>(Arrays.asList("11", "-11")));
		TRANSITION_RULES.put("11", new HashSet<>(Arrays.asList("12", "-12", "10")));
		TRANSITION_RULES.put("12", new HashSet<>(Arrays.asList("13", "-13", "11")));
		TRANSITION_RULES.put("13", new HashSet<>(Arrays.asList("20")));
		TRANSITION_RULES.put("20", new HashSet<>(Arrays.asList("30", "41", "-41", "-30")));
		TRANSITION_RULES.put("30", new HashSet<>(Arrays.asList("31", "20")));
		TRANSITION_RULES.put("31", new HashSet<>(Arrays.asList("30", "32")));
		TRANSITION_RULES.put("32", new HashSet<>(Arrays.asList("35")));
		TRANSITION_RULES.put("35", new HashSet<>(Arrays.asList("32", "36", "-36")));
		TRANSITION_RULES.put("36", new HashSet<>(Arrays.asList("35", "37")));
		TRANSITION_RULES.put("37", new HashSet<>(Arrays.asList("20")));
		TRANSITION_RULES.put("41", new HashSet<>(Arrays.asList("42", "-42", "20")));
	}

	/**
	 * 检查是否为有效的初始状态
	 *
	 * @param state 状态值
	 * @return 是否为有效的初始状态
	 */
	private boolean isValidInitialState(String state) {
		return TRANSITION_RULES.containsKey(state);
	}


	/**
	 * 获取当前状态
	 *
	 * @return 当前状态
	 */
	public String getCurrentState() {
		return currentState;
	}

	/**
	 * 获取当前状态的所有可转换状态
	 *
	 * @return 可转换状态集合
	 */
	public Set<String> getValidNextStates() {
		return new HashSet<>(TRANSITION_RULES.getOrDefault(currentState, Collections.emptySet()));
	}


}
