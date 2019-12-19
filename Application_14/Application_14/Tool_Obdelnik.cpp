#include "pch.h"
#include "Tool_Obdelnik.h"
#include "Fce_Obdelnik.h"
#include "InOut_Obdelnik.h"
#include <iostream>  


void obdelnik()
{
	Obdelnik ob;

	nacti_strany_obdelnika(ob);
	pocitej_obdelnik(ob);
	tisk_UdajeObdelnika(ob);
}
