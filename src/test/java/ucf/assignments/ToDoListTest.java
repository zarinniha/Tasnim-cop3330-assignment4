package ucf.assignments;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @org.junit.jupiter.api.Test
    void addarrayList()
    {
             /*
           ->create a temporary arrayList of ItemList
           ->whenevWr we add a new list check the arerayList size
           ->if it increases than it adds it to list
         */
    }

    @org.junit.jupiter.api.Test
    void removeList()
    {
           /*
           ->initialize a temporary arrayList
           ->remove one from the arrayList
           ->if the number of arraytList gets  less than it gets removed
         */
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        /*
           ->create a temporary arrayList
           ->change the title of that arrayList
           ->check if the title is the updated one
           */

    }


    @org.junit.jupiter.api.Test
    void addItem()
    {
         /*
          ->add a new item in a temporary list
          ->compare the size of the arrayList
          ->if increased by one that it has successfully added
       */
    }

    @org.junit.jupiter.api.Test
    void updateItemDesc()
    {
         /*
          ->add some temporary items in a tempoprary arrayList
          ->change the description of that item
          ->check if that got updated
         */
    }

    @org.junit.jupiter.api.Test
    void updateItemDate()
    {
         /*
          ->add some temporary items in a tempoprary arrayList
          ->change the due date of that item
          ->check if that got updated
         */
    }

    @org.junit.jupiter.api.Test
    void removeItem()
    {
           /*
           ->remove an new item in a temporary list
          ->compare the size of the arrayList
          ->if decreased by one that it has successfully removed
         */
    }

    @org.junit.jupiter.api.Test
    void exportIList() {
        /*
         ->create a arrayList of ItemList
         ->add some ItemList in the arrayList
         ->create a string of that of the information in the file
         ->compare it with the expected string
         */
    }

    @org.junit.jupiter.api.Test
    void importIList()
    {
        /*
            ->create a expected string of a texFile
            ->read from a file and create a string
            ->compare both of the string
         */
    }

    @org.junit.jupiter.api.Test
    void exportIListAll() {
        /*
        ->create a arrayList of ItemList
        ->add some ItemList in the arrayList
        ->create a string of that of the information in the file
        ->compare it with the expected string

         */
    }

    @org.junit.jupiter.api.Test
    void importIListAll()
    {
        /*
           ->loop through the entire arrayList
           ->call importLinst where it will create a string that
            we expect with the actual string

         */
    }



    @org.junit.jupiter.api.Test
    void displayAll()
    {
        /*
          ->create a temporary ArrayList of ItemList
          ->add some itemList of that array
          ->check if the size of the displayed arraytList as same of the temporary arrayList
         */
    }

    @org.junit.jupiter.api.Test
    void displayIncomplete()
    {
         /*
          ->create a temporary ArrayList of ItemList
          ->add some itemList of that array
          ->check iof th size of the displayed arraytList as same of the temporary arrayList's
          item that has the completion status as incomplete
         */
    }

    @org.junit.jupiter.api.Test
    void displaycomplete()
    {
         /*
          ->create a temporary ArrayList of ItemList
          ->add some itemList of that array
          ->check iof th size of the displayed arraytList as same of the temporary arrayList's
          item that has the completion status as complete
         */
    }
}