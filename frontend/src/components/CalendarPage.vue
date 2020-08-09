<template>

<v-main> 
<link href='https://fonts.googleapis.com/css?family=Antic Didone' rel='stylesheet'>
           <v-container class="margin-bottom">
              <template>
                    <v-card>
                        <v-card-text>
                        <h1 class="text-md-center , font-weight-light , font" style="color:#0c494e">
                            Calendar 
                        </h1>
                        
                        </v-card-text>
                    </v-card>
                </template> 
          </v-container>

          <v-container>
              <h1 class="text-md-center , font-weight-light , font" style="color:#0c494e" > This is the yearly ATP Calendar. Each week states what tournaments are being played and includes details such as prize money and points.</h1>
          </v-container>

          
      <v-container>
        <v-row
          align="center"
          justify="center"
        >
          <v-content>
          
               
              <ul>
                <ul v-for="n in 35" v-bind:key = "n">
                    <v-expansion-panels focusable>
                   <v-expansion-panel>
                    <v-expansion-panel-header><h2 class="text-center , font-weight-light , font" style="color:#0c494e">Week: {{n}}</h2> </v-expansion-panel-header>
                
                <v-card v-for='tournament in tournArray' v-bind:key="tournament.id">
                    <ul v-if = "tournament.weekNo == n">
                    <template>
                        <v-expansion-panel-content>
                        <v-card
                            class="mx-auto"
                            max-width="400"
                        >
                        <v-img
                           
                            class="white--text align-end"
                            height="200px"
                            :src ="'/b&wcourt.jpeg'"
                        >
                        <v-card-title>{{tournament.name}}</v-card-title>
                        </v-img>

                        <v-card-subtitle class="pb-0 , fony" style ="color:#0c494e">Week: {{tournament.weekNo}} </v-card-subtitle>

                        <v-card-text class="text--primary , font">
                            <div style ="color:#0c494e">Prize Money: ${{tournament.tMoney}}</div>

                             <div style ="color:#0c494e">Points :{{tournament.tPoints}}</div>
                        </v-card-text>
                        </v-card>
                        <v-container
                            class= "Height: 9px "
                        >
                        </v-container>
                        </v-expansion-panel-content>
                    </template>
                    </ul>
                


                </v-card>
                </v-expansion-panel>
               </v-expansion-panels>
                </ul>
              </ul>
      
                   
          </v-content>
        </v-row>
      </v-container>
    </v-main>
</template>

<script>
  export default {
    props: {
      source: String,
    },
    data(){
           return{
               tournArray: [] , 
           }
        },
        drawer: null,
        created(){
           fetch("http://localhost:8080/tournaments")
               .then(response => {
                   return response.json();
               })
                .then(tournArray => {
                    this.tournArray = tournArray;
                })
                
        }
  } 
</script>

<style >

.margin-bottom{
    margin-bottom: 100px;
}

font{
    
  
    font-family: 'Antic Didone';
  
    font-size: 60px;
}

</style>