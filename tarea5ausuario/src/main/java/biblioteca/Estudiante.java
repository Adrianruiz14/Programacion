package biblioteca;

public class Estudiante {
      
        private String nombre;
        private String apellido;
        private String dni;

        public Estudiante(String nombre, String apellido, String dni) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        @Override
        public String toString() {
            return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((dni == null) ? 0 : dni.hashCode());
            return result;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Estudiante other = (Estudiante) obj;
            if (dni == null) {
                if (other.dni != null)
                    return false;
            } else if (!dni.equals(other.dni))
                return false;
            return true;
        } 

        

        

        
    
    }

    
    

