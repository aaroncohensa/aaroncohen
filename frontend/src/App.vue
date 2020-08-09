<template>

  <v-app id="inspire">

    

<link href='https://fonts.googleapis.com/css?family=Antic Didone' rel='stylesheet'>
<link href="https://fonts.googleapis.com/css?family=Material+Icons" rel="stylesheet">

  <template>
  <v-card class="overflow-hidden">

    <v-navigation-drawer
      v-model="drawer"
      app
      clipped
    >
      <v-list dense>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>event</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title><router-link to="/calendar" style="color:#0c494e ; font-size:20px" class="font">Calendar</router-link></v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-call-split</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title><router-link to="/schedule" style="color:#0c494e ; font-size:20px" class="font">Schedule</router-link></v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-cog</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title><router-link to="/about" style="color:#0c494e ; font-size:20px" class="font">About</router-link></v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-app-bar
      app
      clipped-left
    >
      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>

    
    

      <v-toolbar-title> 
                 <router-link to="/" class="font" style ="color:#0c494e ; margin-left:100px ">TennisAlgo</router-link>
      </v-toolbar-title>

      <v-spacer></v-spacer>

      
  
      

          
          
        </v-app-bar>
        <v-sheet
      id="scrolling-techniques-7"
      class="overflow-y-auto"
      max-height="600"
    >
      <v-container style="height: 60px;">

      </v-container>
    </v-sheet>
    
      </v-card>
      
    </template>
  

    <!-- <v-app-bar 
      app
      absolute
      color="white"
      
    >
    <v-list-item-avatar>
                    <v-img
                    src="/AaronLogo1.jpg"
                ></v-img>
                </v-list-item-avatar>
            <v-toolbar-title style ="color:#0c494e"> 
                 TennisAlgo
            </v-toolbar-title>
            <v-spacer></v-spacer>

      <v-chip
                class="ma-2"
                color="white"
                pill
            >
        <router-link to="/" style="color:#0c494e">Home</router-link>
      </v-chip>

      <v-chip
                class="ma-2"
                color="white"
                
                pill
            >
        <router-link to="/calendar" style="color:#0c494e" >Calendar</router-link>
      </v-chip>

       <v-chip
                class="ma-2"
                color="white"
                pill
            >
        <router-link to="/schedule" style="color:#0c494e">Schedule</router-link>
      </v-chip>
    </v-app-bar> -->

      <router-view></router-view>
    
      <v-footer
      color="white"
      app
      >
      <span class="black--text; font">&copy; Aaron Cohen {{ new Date().getFullYear() }}</span>
    </v-footer>
  </v-app>
</template>
<script>
export default {
    props: {
      source: String,
    },
    data: () => ({
      drawer: null,
    })
}
</script>

<style >
  .font{
    font-family: 'Antic Didone'
  }
</style>