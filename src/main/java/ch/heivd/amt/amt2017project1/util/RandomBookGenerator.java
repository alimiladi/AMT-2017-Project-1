/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.util;

import java.util.UUID;
import javax.ejb.Stateless;

/**
 *
 * @author Ali Miladi
 */
@Stateless
public class RandomBookGenerator implements RandomBookGeneratorLocal {

    private static final String[] bookNames = {
        "The Flames",
        "Darkness",
        "Gone",
        "Lost",
        "Too good to be true",
        "I loved you",
        "My heart",
        "Smoke",
        "The black fog",
        "The Girl",
        "Broken",
        "Red",
        "Heal me",
        "Hope",
        "The chip",
        "Millionaire (or Billionaire)",
        "More Crap",
        "My manic life",
        "Unglued",
        "The Chronicle",
        "San Francisco",
        "New York",
        "December",
        "The night everything fell apart",
        "The swim",
        "Ocean",
        "Desert",
        "Ice",
        "Forever Mine",
        "No Winter",
        "The End",
        "Theif",
        "The Rainbow",
        "Ways to say goodbye",
        "Shooting Star",
        "No Gold",
        "Silver Night",
        "Serenity",
        "Chicken Noodle Soup",
        "Our Souls Entwined",
        "Sweet and Sour",
        "Poison",
        "Forgive and Forget",
        "Never Again",
        "Neverland",
        "Don't forget me",
        "Forest",
        "The Cinemas",
        "Gun",
        "Forever alone",
        "Halfway",
        "My journey",
        "The Flames",
        "Darkness",
        "Gone",
        "Lost",
        "Too good to be true"
    };
    private static final String[] bookAuthors = {
        "Maya Angelou",
        "Annie Proulx",
        "Jeffrey Archer",
        "Philip Ardagh",
        "Simon Armitage",
        "Isaac Asimov",
        "Åsne Seierstad",
        "Diana Athill",
        "Kate Atkinson",
        "Beatrix Potter",
        "Simone de Beauvoir",
        "Samuel Beckett",
        "Antony Beevor",
        "Saul Bellow",
        "Benjamin Markovits",
        "George Bernard Shaw",
        "Louis de Bernières ",
        "Lewis Carroll",
        "Angela Carter",
        "Raymond Carver",
        "Eleanor Catton",
        "Miguel de Cervantes",
        "Michael Chabon",
        "Raymond Chandler",
        "Rajiv Chandrasekaran",
        "Bruce Chatwin",
        "Geoffrey Chaucer",
        "Esi Edugyan",
        "Dave Eggers",
        "George Eliot",
        "James Ellroy",
        "Anne Enright ",
        "Thomas Frank",
        "Jonathan Franzen",
        "Kiran Desai",
        "Arthur Koestler",
        "Milan Kundera",
        "Hanif Kureishi"
    };
    private static final String[] bookThemes = {
        "Science fiction",
        "Satire",
        "Drama",
        "Action and Adventure",
        "Romance",
        "Mystery",
        "Horror",
        "Self help",
        "Health",
        "Guide",
        "Travel",
        "Children's",
        "Religion, Spirituality & New Age",
        "Science",
        "History",
        "Math",
        "Anthology",
        "Poetry",
        "Encyclopedias",
        "Dictionaries",
        "Comics",
        "Art",
        "Cookbooks",
        "Diaries",
        "Journals",
        "Prayer books",
        "Series",
        "Trilogy",
        "Biographies",
        "Autobiographies",
        "Fantasy"
    };

    /**
     * Select a random element within an array of elements
     *
     * @param elements the array in which to select a random element
     * @return one element of the array, selected randomly
     */
    private String pickRandom(String[] elements) {
        return elements[(int) (Math.random() * elements.length)];
    }

    @Override
    public String randomIsbn() {
        return UUID.randomUUID().toString().substring(0, 12);
    }

    @Override
    public String randomName() {
        return pickRandom(bookNames);
    }

    @Override
    public String randomAuthor() {
        return pickRandom(bookAuthors);
    }

    @Override
    public String randomTheme() {
        return pickRandom(bookThemes);
    }

    @Override
    public int randomNbPages() {
        return (int) Math.abs(Math.random()*323*Math.random()+Math.random());
    }
}
