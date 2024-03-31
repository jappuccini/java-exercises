# Fallbeispiel

Wie sind ein Onlinehändler und stellen eine Platform zum Verkaufen von Produkten bereit.
Es gibt zwei Teams. Team Warenkorb und Team Produktverwaltung.

Das Team Warenkorb implementiert den Warenkorb der Onlinehändler Plattform.
Produkte können dem Warenkorb hinzugefügt werden.

Das Team Produktverwaltung implementiert die Verwaltung aller angebotenen Produkte
auf der Onlinehändler Plattform.

## Problem 1

Anbieter von Produkten bemängeln, dass Käufer Produkte bestellen, obwohl der Bestand
im Lager nicht ausreicht. Das Produkt Team hat den Fehler identifiziert und festgestellt,
dass die Produktdetailseite den Lagerbestand anzeigt. Es sollte aber der aktuelle Lagerbestand
abzüglich der aktuell im Warenkorb befindlichen Produkte anzeigen soll.

Lagerbestand von Produkt Xbox: 3
Anzahl an Xbox Exemplaren im Warenkorb: 2
Angezeigter Lagerbestand auf der Produktdetailseite: 3
Gewünschter angezeigter Lagerbestand auf der Produktdetailseite: 1

Lösung:
Das Produktverwaltungsteam möchte, dass bei jeder Änderung im Warenkorb ein Programmcode ausgeführt wird,
den das Produktverwaltungsteam jederzeit anpassen kann. Für ihre Anpassungen brauchen Sie Zugriff auf alle
Produkte im Warenkorb.

## Problem 2

Anbieter von Produkten bemängeln, dass Kaufer Produkte bestellen, obwohl Sie nicht zahlungsfägig sind oder
Kunden gar nicht berechtigt sind spezifische Produkte zu kaufen.

Lösung:
Das Produktverwaltungsteam möchte, dass vor dem Hinzufügen eines Produktes zum Warenkorb ein Programmcode
ausgeführt wird, den das Produktverwaltungsteam jederzeit anpassen kann. Für ihre Anpassung brauchen Sie
Zugriff auf das aktuelle Produkt und den Kunden.
