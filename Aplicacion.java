/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

/**
 *
 * @author Mathew
 */
public class Aplicacion {
  function sumarNumerosPares(arr) {
  let suma = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 0) {
      suma += arr[i];
    }
  }
  return suma;
}

// Ejemplo de uso:
let numeros = [1, 2, 3, 4, 5, 6];
let resultado = sumarNumerosPares(numeros);
console.log(resultado); // Output: 12

}
