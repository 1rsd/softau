from django.shortcuts import render, redirect
from django.http import HttpResponse
from .models import Empleado
from .forms import EmpleadoForm
# Create your views here.
def inicio(request):
    return render(request,'pages/inicio.html')
def nosotros(request):
    return render(request,'pages/about_us.html')
def empleados(request):
    empleados =Empleado.objects.all() 
    return render(request,"books/index.html",{'empleados':empleados})
def create(request):
    form = EmpleadoForm(request.POST or None,request.FILES or None)
    if form.is_valid():
        form.save()
        return redirect(empleados)
    return render(request,"books/create.html",{'form':form})
def delete(request,Id_interno):
    empleado=Empleado.objects.get(Id_interno=Id_interno)
    empleado.delete()
    return redirect('empleados')
def edit(request, Id_interno):
    empleado=Empleado.objects.get(Id_interno=Id_interno)
    form = EmpleadoForm(request.POST or None,request.FILES or None,instance=empleado)
    if form.is_valid() and request.method == 'POST':
        form.save()
        return redirect('empleados')
    return render(request,"books/edit.html",{'form':form})