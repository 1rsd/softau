from django.db import models

class Empleado(models.Model):
    Id_interno = models.CharField(max_length=50,primary_key=True)
    Nombre = models.CharField(max_length=50,verbose_name='Nombre',null=True)
    Apellido = models.CharField(max_length=50,verbose_name='Apellido',null=True)
    Tipo_ID = models.CharField(max_length=10,verbose_name='Tipo_ID',null=True)
    Numero_ID = models.CharField(max_length=50,verbose_name='Numero_ID',null=True)

    def __str__(self):
        row= "Id_interno: "+self.Id_interno+" Nombre: "+self.Nombre+" Apellido: "+self.Apellido
        return row