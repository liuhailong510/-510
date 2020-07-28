package com.www.aaa;

import java.util.Scanner;

/**
 * @Author：LHL
 * @Date：2020/7/12 15:19
 */
public class familyAccount {
    public static void main(String[] args) {
        System.out.println("--------------------"+"家庭收支记账软件"+"--------------------");
        Scanner scanner = new Scanner(System.in);
        int income = 1;
        if(income == 1){
            System.out.println(" "+1+"、收支明细");
            System.out.println(" "+2+"、登记收入");
            System.out.println(" "+3+"、登记支出");
            System.out.println(" "+4+"、退    出");
        }

    }
}
