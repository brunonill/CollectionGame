# CollectionGame
Zadanie dodatkowe (na więcej niż jeden moduł): napisz inteligentną planszę do gry w warcaby.
Założenia:
1) Plansza (Board) ma posiadać kolekcję wierszy (BoardRow)
2) Wiersz ma posiadać kolekcję figur w danym wierszu (Figure)
3) Dostępne figury to: Pawn (pionek), Queen (damka) oraz None (brak figury)
4) Figury dziedziczą z klasy ogólnej Figure, która posiada atrybut color
5) Plansza posiada metody:
- Figure getFigure(int row, int col) - zwracającą figurę umieszoną w danym miejscu na planszy
- void setFigure(int row, int col, Figure figure) - ustawiającą figurę na danym miejscu planszy
- String toString() - wyświetlającą planszę w sposób niby-graficzny (używając znaków =, -, oraz |)

Następnie w metodze main utwórz obiekt planszy, ustaw kilka figur na planszy i wyświetl planszę.



- ustawienie planszy 10x10 skladajacej sie z kolecji Figur none- do koloru drawBoard (Boolean default)
- ustawienie pionkow na planszy wedlug koloru none


-rysownie planszy

2 - pole czarne pionki
2 = pole biale  pionki
4 - pole puste /bialo czarne

-puste--
