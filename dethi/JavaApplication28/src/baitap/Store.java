/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Store {
    Scanner sc = new Scanner(System.in);
    public static int totalItems = 0;
    public int MAX_ITEMS = 1000;
    ArrayList<Book> listItems = new ArrayList();
    public void add() {
        Book book1 = new Book();
        System.out.println("Nhập ID: ");
        book1.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên sách:  ");
        book1.setName(sc.nextLine());
        System.out.println("Nhap giá sách: ");
        book1.setPrice(sc.nextInt());
        listItems.add(book1);
        totalItems++;
    }
    public void delete (int id)
    {
       for(Book x: listItems)
        {
            if(x.getId()== id)
            {
                listItems.remove(x);
                totalItems--;
                System.out.println("Xóa thành công!");
                break;
            }
            else
            {
                System.out.println("Không có sách trùng với ID cần xóa");
                break;
            }
        }
    }
    public void find(String name)
    {
        for(Book x: listItems)
        {
            if(x.getName().equalsIgnoreCase(name))
            {
                System.out.println(x.toString());
                break;
            }
            else
            {
                System.out.println("Không tìm được sách theo tên cần nhập!");
                break;
            }
        }
    }
    public void edit(int id)
    {
        for(Book x: listItems)
        {
            if(x.getId()== id)
            {          
                sc.nextLine();
                System.out.println("Nhập tên sách mới: ");
                x.setName(sc.nextLine());
                System.out.println("Nhập giá sách mới: ");
                x.setPrice(sc.nextInt());
                break;
            }
            else
            {
                System.out.println("Không có sách nào trùng với ID bạn vừa nhập!");
                break;
            }  
        }
    }
    public void list()
    {
        System.out.println("Tổng số sách là: " + totalItems);
        for(Book x: listItems)
        {
            System.out.println(x + "");
        }
    }
}
