package com.globallogic.bootcampgl.junitTest;

/**
 * Hello world!
 *
 */
public class App 
{
	public int sumar(int num1, int num2) {
		return num1+num2;
	}
	
	public boolean iterador(int max) {
		for(int i = 1; i <= max; i++) {
			if(i == 3) {
				return true;
			}
		}
		return false;
	}
	
    public static void main( String[] args )
    {

    }
}
