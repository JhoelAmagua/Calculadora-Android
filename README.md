# Calculadora-Android
## Integrantes: Amagua Jhoel - Curipoma David
### Interfaz principal
La interfaz principal consta de un botón para cada número del 0 al 9, las cuatro principales 
operaciones matemáticas, como son; +, -, x, ÷. Además de un botón con punto para los decimales.
Adicional se implementó 7 operaciones más, como es el elevar un número al cuadrado, elevar un número al cubo,
la raíz cuadrada y cubita de un número, el seno, coseno y tangente. Y por último se tiene un botón para borrar toda
la pantalla y el igual para la respuesta.

### Funcionalidad de botones de números
Cada número debe ser declarado y configurado con el botón correspondiente.

     Button n0 = (Button) findViewById(R.id.cero);
     n0.setOnClickListener(this);
     Button n1 = (Button) findViewById(R.id.uno);
     n1.setOnClickListener(this);
     Button n2 = (Button) findViewById(R.id.dos);
     n2.setOnClickListener(this);
     Button n3 = (Button) findViewById(R.id.tres);
     n3.setOnClickListener(this);
     Button n4 = (Button) findViewById(R.id.cuatro);
     n4.setOnClickListener(this);
     Button n5 = (Button) findViewById(R.id.cinco);
     n5.setOnClickListener(this);
     Button n6 = (Button) findViewById(R.id.seis);
     n6.setOnClickListener(this);
     Button n7 = (Button) findViewById(R.id.siete);
     n7.setOnClickListener(this);
     Button n8 = (Button) findViewById(R.id.ocho);
     n8.setOnClickListener(this);
     Button n9 = (Button) findViewById(R.id.nueve);
     n9.setOnClickListener(this);
     Button punto = (Button) findViewById(R.id.punto);
     punto.setOnClickListener(this);
     
### Funciones principales +, -, x, ÷
Cada función también consta de un botón en cada una, y deben ser declaradas para ser usadas.
Estas funciones deben esperar que el usuario presione el signo igual, despues de ingresar los valores,
a contiuación se ejecuta y devuelve el resultado, ya que las 4 operaciones estan envueltas en un case
que espera la función de igual.


    Button sumar = (Button) findViewById(R.id.suma);
    sumar.setOnClickListener(this);
    Button restar = (Button) findViewById(R.id.resta);
    restar.setOnClickListener(this);
    Button dividir = (Button) findViewById(R.id.div);
    dividir.setOnClickListener(this);
    Button multiplicar = (Button) findViewById(R.id.multi);
    multiplicar.setOnClickListener(this);
    
    case R.id.igual:
                    numero[1]= Double.parseDouble(a);
                    if(suma) {
                        resultado = numero[0]+ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (resta){
                        resultado = numero[0]- numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (multi){
                        resultado = numero[0]* numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (divide){
                        resultado = numero[0]/ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }

### Otras funciones: 
Tenemos funcionalidades como elevar al cuadrado y al cubo un número, ademas de raíz cuadrada y cubica,
y finalmente seno, coseno y tangente. Estos botones no esperan el presionar el signo igual, ya que deben
ejecutarse, una vez el usuario ingrese un número y presionen la función.
A continuación se muestra el código implementado para la función de elevar al cuadrado, la cual estará en un 
case fuera del igual, esto permitirá que se ejecute la función, una vez que se presione la función. Esto se
repite para estas 7 funcionalidades adicionales.


    case R.id.cuadrado:
                    exp2 = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=(numero[0]*numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                    
### Resultado
Tanto para visualizar los números digitados, como los resultados obtenidos, se tiene la pantalla principal,
la cual mostrará los resultados, aún cuando sean decimales.


### Funcionalidad completa de los botones
Toda la funcionalidad estará envuelta en un Try para evitar errores mientras se ejecuta la calculadora,
si el usuario se equivoca, la pantalla unicamente muestra un mensaje diciendo ERROR.


      try {
            switch (seleccion) {
                case R.id.cero:
                    pantalla.setText(a+"0");
                    break;
                case R.id.uno:
                    pantalla.setText(a+"1");
                    break;
                case R.id.dos:
                    pantalla.setText(a+"2");
                    break;
                case R.id.tres:
                    pantalla.setText(a+"3");
                    break;
                case R.id.cuatro:
                    pantalla.setText(a+"4");
                    break;
                case R.id.cinco:
                    pantalla.setText(a+"5");
                    break;
                case R.id.seis:
                    pantalla.setText(a+"6");
                    break;
                case R.id.siete:
                    pantalla.setText(a+"7");
                    break;
                case R.id.ocho:
                    pantalla.setText(a+"8");
                    break;
                case R.id.nueve:
                    pantalla.setText(a+"9");
                    break;
                case R.id.punto:
                    pantalla.setText(a+".");
                    break;
                case R.id.borrar:
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.eliminar:
                    String cadena = a.substring(0, a.length() - 1);
                    pantalla.setText(cadena);
                    break;
                case R.id.div:
                    divide = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.igual:
                    numero[1]= Double.parseDouble(a);
                    if(suma) {
                        resultado = numero[0]+ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (resta){
                        resultado = numero[0]- numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (multi){
                        resultado = numero[0]* numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (divide){
                        resultado = numero[0]/ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }
                    decimal = false;
                    suma = false;
                    resta = false;
                    multi = false;
                    divide = false;
                    exp2  = false;
                    exp3  = false;
                    raizcuadrada = false;
                    raizcubica = false;
                    seno = false;
                    coseno = false;
                    tangente = false;
                    break;
                case R.id.multi:
                    multi = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.resta:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;

                case R.id.suma:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.cuadrado:
                    exp2 = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=(numero[0]*numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.raizc:
                    raizcuadrada = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.sqrt(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.raizcu:
                    raizcubica = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.cbrt(numero[0]) ;
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.cubo:
                    exp3 = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=(numero[0]*numero[0])*numero[0];
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.seno:
                    seno = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sin(numero[0]);
                    pantalla.setText(String.valueOf( resultado+" radianes"));
                    decimal = false;
                    break;
                case R.id.coseno:
                    coseno = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.cos(numero[0]);
                    pantalla.setText(String.valueOf( resultado+" radianes"));
                    decimal = false;
                    break;
                case R.id.tangente:
                    tangente = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.tan(numero[0]);
                    pantalla.setText(String.valueOf( resultado+" radianes"));
                    decimal = false;
                    break;
            }
        }catch(Exception e){
            pantalla.setText(" Error");
        };
