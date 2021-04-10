package parcial.app;

import banco.dominio.Persona;
import dispensadoraComida.dominio.Productos;
import parcial.dominio.Material;
import parcial.dominio.Pooflix;
import parcial.dominio.TipoMaterial;

import java.util.Scanner;

public class App {
    Scanner read = new Scanner(System.in);
    Pooflix pooflix = new Pooflix();
    Material Joker = new Material(1,120,"Joker", "Pelicula");
    Material MadMax = new Material(2,190,"MadMax", "Pelicula");
    Material Skins = new Material(3,150,"Skins","Serie");
    Material Raya = new Material(4,110,"Raya", "Animada");
    Material Breaking = new Material(5,200,"Breaking Bad", "Serie");
    Material Franco = new Material(6,190,"Franco Escamilla", "Stand Up");
    Material Castillo = new Material(7,190,"Castillo Vagabundo", "Animada");
    Material TheBoys = new Material(8,130,"The Boys", "Serie");
    Material Tarzan = new Material(9,190,"Tarzan", "Animada");
    Material Supercool = new Material(10,100,"SuperCool", "Pelicula");
    Material Vallarta = new Material(11,140,"El amor es de Putos", "Stand Up");
    Material Sherk = new Material(12,110,"Shrek", "Pelicula");
    Material DemonSlayer = new Material(13,160,"Kimetsu No Yaiba", "Serie");

}
