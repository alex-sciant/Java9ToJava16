package com.sciant.techtalk.javanews;

sealed class Animal permits Cat, Dog {}

non-sealed class Dog extends Animal {}

final class Cat extends Animal {}

final class Labrador extends Dog {}














public class SealedClasses {}
