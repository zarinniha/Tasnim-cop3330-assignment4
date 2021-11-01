/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Zarin Tasninm
 */

package ucf.assignments;

import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {

    String title;          //the title of the task
    ArrayList<ItemList> list;   //ToDoList ArrayList that holds ItemList


    public static ArrayList<ItemList>addarrayList (ArrayList<ItemList> list)
    {
        //create a new arrayList of itemList so we can have a to do list that can have 100 items
        //add the new list to the ArrayList
    }

    public static void removeList(ArrayList<ItemList> list,String name)
    {
        /*
           ->search the name amomg the list of tasks
           ->if matches remove it from the arrayList
         */
    }

   public static void setTitle(String title)
    {
       /*
           ->set the title of the arrayList
        */
    }

    public static String getTitle()
    {
         /*
             ->this methods gets the title of arrayList
          */
    }

    public static boolean NameExists(String name)
    {
        /*
           ->compare the name that we want to create a item fo with
             all the items of the list.
             ->if exists return false otherise return true
         */
    }

    public static ItemList getItem(String name)
    {
        /*
           ->call the NameExsts method
           ->if the name exists return the ItemList object
           ->otherwise return Null
         */

    }

    public static void addItem(String name, String description, LocalDate dueDate, boolean iscomplete)
    {
        /*
           ->create a new object of an item
           ->call nameexists method
           ->check if the item name exits in the name or not, if exits, then print error
           ->set the description, duedate and
             initial completion status to the item
         */
    }

    public static void updateItemDesc( String newdescription, String desc)
    {
        /*
           ->find the item name from the list
           ->if we find it then set the  new Description
         */
    }

    public static void updateItemDate(LocalDate newdueDate,LocalDate dueDate)
)
    {
        /*
           ->find the item name from the list
           ->if we find it then set the  new dueDate,
         */
    }

    public static void removeItem(String name)
    {
        /*
           ->find the item from the list of items
           ->if the name matches, remove it from the list
           ->display the other remaining ItemList
         */
    }

    public static void exportIList(String name)
    {
        /*
           ->get the file where we want to save this project
           ->create a fileWriter object
           ->write all the items of the list including all the attributes
         */
    }
    public static void exportIListAll(String path)
    {
        /*
           ->loop through each arrayList of the ToDoList
           ->call the exportList everytime to save the item in every arrayList
         */
    }

    public static void importIList(String name)
    {
       /*
          ->create a bufferreader which has the path of the paramter
          ->create an object of bufferReader
          ->read each line of the file and add it to the item
          ->split the readeing string as name, description and due date
          ->add the attributes to the item by calling the addItem method
        */
    }

    public static void importIListAll(String name)
    {
       /*
          ->create a new ArrayList of ToDoList
          ->loop through each ArrayList
          ->read each line of the itemsList on that arrayList by calling importList method
          ->add the list to the newArrayList
        */
    }


   public static ArrayList<ItemList> findItem(String desc){
        /*
           ->compare all the description that is in this list
           ->if match found return it
           ->otherwise return NULL
         */
    }

    public static void displayAll(ArrayList<ItemList> list)
    {
        /*
           ->Loop through the entire arrayList
           ->display all the items of that arrayList
         */
    }

    public static void displayIncomplete(ArrayList<ItemList> list)
    {
        /*
           ->Loop through the entire arraList and find the completion status incomplete
           ->display only the items that has the completion status as incomplete
         */
    }

    public static void displaycomplete(ArrayList<ItemList> list)
    {
        /*
           ->Loop through the entire arraList and find the completion status complete
           ->display only the items that has the completion status as complete
         */
    }





}
