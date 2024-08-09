# Usar una imagen base con Node.js
FROM node:20.15.1

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar los archivos de package.json y package-lock.json
COPY package*.json ./

# Instalar las dependencias de la aplicación
RUN npm install

# Copiar el resto de la aplicación al contenedor
COPY . .

# Exponer el puerto en el que la aplicación se ejecuta
EXPOSE 5173

# Comando para iniciar la aplicación
CMD ["npm", "run", "dev"]