package demo.innerclasses.member;

import java.util.ArrayList;
import java.util.Collections;

import demo.innerclasses.Helper;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = Helper.getExampleNumbers();
        Helper.printNumbers(numbers);

        Member member = new Member();

        Collections.sort(numbers, member.new NumberAscComparator());
        Helper.printNumbers(numbers);
    }
}
