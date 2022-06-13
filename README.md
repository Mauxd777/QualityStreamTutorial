# Proyecto De Calidad del Software

## Como instalar Selenium en nuestro proyecto

![Image text](https://github.com/Mauxd777/QualityStreamTutorial/blob/main/src/test/java/Imagenes/Selenium.png)

>*Selenium*

```text
Es una herramienta de código abierto para la automatización de pruebas de 
aplicaciones web, nos proporciona una herramienta con la cual podremos 
grabar o reproducir, editar y depurar casos de prueba, la cual no permitirá
ejecutar algunas pruebas repetidamente las veces que sea necesario.
```

Más información sobre [Selenium](https://inmediatum.com/blog/piensa-digital/que-es-selenium-y-para-que-sirve/).

>*¿Como descargar Selenium web driver?*

```text
En este caso vamos a instalar Selenium web driver con 
el lenguaje de programación de Java utilizando Visual Studio Code.

Para esto necesitamos crear un java proyect tipo maven 
y dirigirnos a la siguiente carpeta.
```

![Image text](https://github.com/Mauxd777/QualityStreamTutorial/blob/main/src/test/java/Imagenes/Carpeta.PNG)

```text
En este apartado justo debajo de donde dice 
<version>0.0.1-SNAPSHOT</version>
Como se muestra en la imagen, ingresamos el siguiente código, esto 
instalara las librerías necesarias para Selenium y Junit,
de manera que todo corra de manera correcta a la hora de hacer
procesos de automatización.
```

![Image text](https://github.com/Mauxd777/QualityStreamTutorial/blob/main/src/test/java/Imagenes/Donde.png)

>*Código*

```text
 <dependencies>
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.1.4</version>
  <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13-beta-1</version>
  <scope>test</scope>
    </dependency>
  </dependencies>
```

## Configuración básica del proyecto

```text
Acá podemos ver un poco de la planificación y configuración
del ambiente de pruebas a utilizar.
```

![Image text](https://github.com/Mauxd777/QualityStreamTutorial/blob/main/src/test/java/Imagenes/Micodigo.png)

>*Código*

```text
package com.qualitystrem.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// aca escribio andres

public class GoogleSearchTests {
	
	public WebDriver driver;
	
	@Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		//esto solo es para que no se cierre el navegador
	}
	
	@Test
	public void testeGooglePage() {
		WebElement searchbox = driver.findElement(By.name("search_query"));
		searchbox.clear();
		searchbox.sendKeys("Esto es una prueba");
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("Search - My Store", driver.getTitle());
		JOptionPane.showMessageDialog(null,"Esta pura prueba sale bien");
	}
	@After
	public void tearDow() {
	 driver.quit();
	}


}
```

>*Evidencia de que el proyecto se ejecuta de manera correcta en el ambiente de pruebas.*

![Image text](https://github.com/Mauxd777/QualityStreamTutorial/blob/main/src/test/java/Imagenes/Micodigo.png)
