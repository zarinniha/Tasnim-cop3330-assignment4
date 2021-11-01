/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Zarin Tasninm
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AppViewController {

    /*create an object of ItemList and ToDoList*/

    ToDoList list = new ToDoList();

    @FXML
    private DatePicker DueDate;  //for the due date

    @FXML
    private Button ItemComplete;   //button to update an item as complete

    @FXML
    private TextArea ItemDesc;    //text area where the item description is being written

    @FXML
    private TextField TaskTitle;  //text area where the task title is being written

    @FXML
    private ListView itemList;    //the list area where the items of the list is being shown

    @FXML
    void AddItem(ActionEvent event) {

        /*
           ->check if the same desc item exists or not by calling the findItem method
           ->create a temporary ItemList object
           ->if name does not exists then add in the temporary ItemList GUI attributes:
               .ItemDesc
               .DueDate by calling the methods in ItemList
           ->call the addItem method from the ToDoList class to add the item to the ToDoList
           ->display the list with the new itemm added to it

         */

    }

    @FXML
    void EditItem(ActionEvent event) {

        /*
           ->find the item from the list by calling the findItem method
           ->call the updateItemDesc and updateItemDate method from the ToDoList class
           ->update the item based on the GUI attributes:
               .ItemDesc
               .DueDate
           ->display the list with the new itemm added to it
         */

    }

    @FXML
    void DeletItem(ActionEvent event) {

        /*
          ->get the description from the itemDesc Area
          ->find the item by calling findItem method
          ->call the removeItem method from ToDoList class
          ->remove the item from the list
          ->Display the new list with the removed item
         */

    }



    @FXML
    void EditTask(ActionEvent event)
    {
       /*
           ->get the updated title from the TaskTitle
           ->get the old title by calling the getTitle method from ToDoList class
           ->set the title of the arrayList by calling the method from ToDoList class
       */
    }

    @FXML
    void DeletTask(ActionEvent event) {

        /*
           ->remove the list that we selected from the storage
         */

    }

    @FXML
    void DisplayAll(ActionEvent event) {

        /*
        ->refresh the whole list area by calling the refresh method
        ->call the disaplayAll method from ToDoList class
        ->get all the items from the list.
        ->show all the items of the list, regardless its completion status
        */

    }

    @FXML
    void displayComplete(ActionEvent event) {

        /*
        ->refresh the whole list area by calling the refresh method
        ->call the disaplayComplete method from ToDoList class

        */

    }

    @FXML
    void displayIncomplete(ActionEvent event) {

        /*
        ->refresh the whole list area by calling the refresh method
        ->call the disaplayAll method from ToDoList class

        */

    }

    @FXML
    void searchItemButton(ActionEvent event) {

        /*
          ->get the item by the description in the itemDesc area by
            calling the itemfound method
         */

    }
    @FXML
    void LoadItemButton(ActionEvent event)
    {
        /*
            ->create a file object
            ->check if that file exits or not
            ->if doesn't exist, call the importList method from the ToDoList class
            ->display the list in the itemList
         */

    }

    @FXML
    void saveItemButton(ActionEvent event) {
        /*
           ->call the exportList method from ToDoList class
           ->save the item on that path in the list
         */

    }

    @FXML
    void LoadallItemButton(ActionEvent event)
    {
        /*
           ->call the exportListAll method from the ToDoList class
           ->display all the lists in the itemList
         */

    }


    @FXML
    void SaveallButton(ActionEvent event)
    {
        /*
           ->call the exportListAll method from the ToDoList class
           ->save the items in the all the lists in that directory
         */

    }



    @FXML
    void RefreshList(ActionEvent event) {

        /*
          ->refresh the itemList
         */

    }



}
