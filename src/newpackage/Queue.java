/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Alina
 */

//Create Queue

public class Queue
{    
    Link first = null;
    Link last = null;
    
   //Check if Queue is empty 
   
    public boolean isEmpty()
    {
        return first ==  null;
    }
    
    //Enqueue method
    
    public void Enqueue(String x)
    {       
        Link temp = new Link(x);
        
        if (isEmpty())
        {
            first = temp;
            last = first;
        }
        else
        {
        last.next = temp;
        last = temp;
        }
    }
    
    //Dequeue method
    
        public Link Dequeue()
    {        
        if(isEmpty())
        {
           return null;           
        }
        
        else
        {
            Link temp = new Link(first.number);
            first = first.next;
            return temp;            
        }
    }            

    //Make string to show value of queue
        
    public String toString()
    {
    StringBuilder sb = new StringBuilder();
    for (Link N = first; N != null; N = N.next)
    {
        sb.append(N.number + " ");
    }
    return sb.toString();
    }
        
}
