
public class Test06 {

	public static void main(String[] args) {
		//位运算符:讨论的是二进制的数据 每一位上的数字的运算关系
		//& 按位与：如果两个操作数的相应位均为 1，则该位的结果值为 1,否则为0
		//8&2   00001000
		//      00000010
		//      00000000    --> 0
		
		//| 按位或：如果两个操作数的相应位有一个为 1，则该位的结果值为 1，否则为0
		//8|2   00001000
		//		00000010   
		//		00001010   --> 10
		
		//~按位取反：将操作数按位取反（0 到 1 和 1 到 0） 
		//~8    00001000   --> -9
		//	 	11110111
		//      -1*2^7+ 1*2^6+1*2^5+1*2^4+0*2^3+1*2^2+1*2^1+1*2^0 
		//        -128+   64 + 32+   16+  0     +4+   2 + 1
		
		//^ 按位异或:如果参加运算的两个操作数的相应位同号，则结果为 0，异号则为 1
		// 8^2   00001000
		//		 00000010
		//       00001010 --> 10
		//^2     00000010 
		//       00001000  -->还原成8
		
		//<< 按位左移 右边必须是整数 :左端（高位）移出部分舍弃，右端（低位）补0
		//8<<2   00001000
		//       00100000 --> 32
		
		//>> 按位右移(右边必须是整数):右端（低位）移出部分舍弃，左端（高位）根据符号位补0或者1，无符号或正数补0，负数补1
		//8>>2  00001000
		//		00000010  --> 2
		
		//>>> 按位右移(不考虑符号位),总是补0
		
		
		//利用异或算法进行简单的字符加密:一个数字被同一个数字连续异或两次，会还原
		char c = '我';
		char p = '丫';
		
		char newChar =(char) (c^p);
		System.out.println("加密后:"+newChar);
		
		char oldChar = (char)(newChar^p);
		System.out.println("解密后:"+oldChar);
		
		
		
		

		

	}

}
