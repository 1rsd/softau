from django.urls import path
from . import views

urlpatterns = [
    path('',views.inicio, name='inicio'),
    path('about_us',views.nosotros, name = 'about_us'),
    path('empleados',views.empleados,name = 'empleados'),
    path('create',views.create,name = 'create'),
    path('edit/<str:Id_interno>',views.edit,name = 'edit'),
    path('delete/<str:Id_interno>',views.delete,name = 'delete'),

]