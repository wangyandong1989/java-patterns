package com.ithinksky.petterns.a02creational.t02abstractfactory;

import com.ithinksky.petterns.a02creational.t02abstractfactory.keyboard.IKeyboardProduct;
import com.ithinksky.petterns.a02creational.t02abstractfactory.keyboard.LogitechKeyboardProduct;
import com.ithinksky.petterns.a02creational.t02abstractfactory.mouse.IMouseProduct;
import com.ithinksky.petterns.a02creational.t02abstractfactory.mouse.LogitechMouseProduct;

/**
 * @author tengpeng.gao
 */
public class LogitechFactory implements Factory {
	@Override
	public IKeyboardProduct manufactureKeyboard() {
		return new LogitechKeyboardProduct();
	}

	@Override
	public IMouseProduct manufactureMouse() {
		return new LogitechMouseProduct();
	}
}
