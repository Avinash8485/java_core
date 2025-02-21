package com;

abstract class GooglePay {
	abstract void pay(int amount);
}
abstract class Amazon extends GooglePay{
	abstract void buy(String product);
}