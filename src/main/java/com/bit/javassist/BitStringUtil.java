package com.bit.javassist;

public class BitStringUtil {
	/**
	 * 宸叉坊鎷兼帴鐨勬柟寮忔坊鍔犲瓧绗︿覆
	 * 
	 * @param length
	 * @return
	 */
	public String addString(int length) {
		String result = "";
		for (int i = 0; i < length; i++) {
			result += (char) (i % 26 + 'a');
		}
		return result;
	}

	/**
	 * 宸茶拷鍔犵殑鏂瑰紡娣诲姞瀛楃涓�
	 * 
	 * @param length
	 * @return
	 */
	public String buildString(int length) {
		StringBuilder inst = new StringBuilder();
		for (int i = 0; i < length; i++) {
			inst.append((char) (i % 26 + 'a'));
		}
		return inst.toString();
	}

	public static void main(String[] args) {
		BitStringUtil util = new BitStringUtil();
		util.addString(1000);
		long begin = System.nanoTime();
		util.addString(10000);
		System.out.println(System.nanoTime() - begin);
		begin = System.nanoTime();
		util.buildString(10000);
		System.out.println(System.nanoTime() - begin);
	}
}
