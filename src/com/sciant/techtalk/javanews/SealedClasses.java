package com.sciant.techtalk.javanews;

//Since Java 15

sealed class Animal permits Cat, Dog {}

non-sealed class Dog extends Animal {}

final class Cat extends Animal {}

final class Labrador extends Dog {}














public class SealedClasses {}
