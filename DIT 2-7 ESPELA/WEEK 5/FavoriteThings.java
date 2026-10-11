/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class FavoriteThings {
    public static void main(String args[]) {
   String[] favoriteThings = {"Coffee", "Books", "Coding", "Music", "Sunset"};
        System.out.println("-------------------------");
        System.out.println("--- My Favorite Things --");
        System.out.println("-------------------------");
       
        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println((i + 1) + ". " + favoriteThings[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Total items: " + favoriteThings.length);
    }
    }

