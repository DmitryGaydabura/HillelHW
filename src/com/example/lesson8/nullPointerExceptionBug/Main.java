package com.example.lesson8.nullPointerExceptionBug;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static class Ball {
    }

    private static class Board {
        private List balls;

        public Board() {
            //List balls = new ArrayList<>();
            //Строка выше Выдавала ошибку, т.к. это конструктор объекта типа Board.
            //Нам не нужно объявлять новый List, т.к. его объявление уже произошло в качестве поля этого класса.
            balls = new ArrayList<>();

            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
        }

        public int count() {
            return balls.size();
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.count());
    }
}
