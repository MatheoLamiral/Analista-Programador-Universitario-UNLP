����   = p  #Practica2/ejercicio6/Transformacion  java/lang/Object bt #LPractica2/ejercicio1y2/BinaryTree; 	Signature 8LPractica2/ejercicio1y2/BinaryTree<Ljava/lang/Integer;>; <init> &(LPractica2/ejercicio1y2/BinaryTree;)V ;(LPractica2/ejercicio1y2/BinaryTree<Ljava/lang/Integer;>;)V Code
   	  ()V	     LineNumberTable LocalVariableTable this %LPractica2/ejercicio6/Transformacion; 
binaryTree LocalVariableTypeTable suma %()LPractica2/ejercicio1y2/BinaryTree; :()LPractica2/ejercicio1y2/BinaryTree<Ljava/lang/Integer;>;
     total &(LPractica2/ejercicio1y2/BinaryTree;)I ;(LPractica2/ejercicio1y2/BinaryTree<Ljava/lang/Integer;>;)I
 ! # " !Practica2/ejercicio1y2/BinaryTree $ % isLeaf ()Z
 ! ' ( ) getData ()Ljava/lang/Object; + java/lang/Integer
 * - . / intValue ()I
 * 1 2 3 valueOf (I)Ljava/lang/Integer;
 ! 5 6 7 setData (Ljava/lang/Object;)V
 ! 9 : % hasLeftChild
 ! < =  getLeftChild
 ! ? @ % hasRightChild
 ! B C  getRightChild bint sum I StackMapTable main ([Ljava/lang/String;)V
 ! K 	 7
 ! M N 
 addLeftChild
 ! P Q 
 addRightChild
  S 	 
	 U W V java/lang/System X Y out Ljava/io/PrintStream; [ Arbol original: 
 ] _ ^ java/io/PrintStream ` a println (Ljava/lang/String;)V
 ! c d  	printTree f 
-------------
  h   j Arbol transformado:  args [Ljava/lang/String; t 
SourceFile Transformacion.java !                 	 
          X     
*� *+� �             	 	 
        
       
           
                <     **� � W*� �       
     	                          �     L=+�  � +� &� *� ,=+� 0� 4�+� 8� *+� ;� `=+� >� *+� A� `=+� 0� 4�       & 	      	        0  B  J          L       L D    J E F         L D   G    �  	 H I         �� !Y� 0� JL+� !Y� 0� J� L+� !Y� 0� J� O+� ;� !Y� 0� J� O+� A� !Y� 0� J� L+� A� !Y� 0� J� O� Y+� RM� TZ� \+� b� Te� \,� gW� Ti� \+� b�       :       !  " * # < $ N % a ' j ( r ) v * ~ + � , � - � /         � k l    �    j & m         �     n    o