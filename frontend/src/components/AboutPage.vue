<template>

    <v-main>
        <v-container>
              <template>
                    <v-card>
                        <v-card-text>
                        <h1 class="text-md-center , font-weight-light , font" style="color:#0c494e">
                            About Me 
                        </h1>
                        </v-card-text>
                    </v-card>
                </template> 
          </v-container>


        <v-layout row style="margin-top:100px">
            <v-flex md6>
                <v-img src="/aaron.JPG" style="width:70% ; margin-left:150px ; margin-top:15px"></v-img>
            </v-flex>
            <v-flex md6>
                <v-sheet
                    height=345px
                    color="white"
                    width = "80%"
                    elevation = "7"
                >
                    <div style="margin-top:15px">
                        <h1 class="text-md-center , font-weight-light ,font " style="margin-bottom:25px ;color:#0c494e ;"> Me</h1>
                        <p class="text-md-center , font-weight-light , font-and-size" >
                            My name is Aaron Cohen and I am currently a Junior at Yeshiva University in New York. I am a Computer Science major and Economics minor, which means I love to problem solve and look at the world in different ways. I'm extremely passionate about tech, sports and design. I'm currently captain of the YU Tennis team, and a member of the Golf and Soccer teams, all of which are NCAA D3 teams. 
                        </p>
                    </div>
                </v-sheet>
            </v-flex>
        </v-layout>

        <v-layout row style="margin-top:100px ; margin-bottom:50px">
            <v-flex md6>
                <v-img src="/elephants.jpeg" style="width:70% ; margin-left:150px ; margin-top:15px"></v-img>
            </v-flex>
            <v-flex md6>
                <v-sheet
                    height=345px
                    color="white"
                    width = "80%"
                    elevation = "7"
                >
                    <div style="margin-top:15px">
                        <h1 class="text-md-center , font-weight-light ,font " style="margin-bottom:25px ;color:#0c494e ;"> Background</h1>
                        <p class="text-md-center , font-weight-light , font-and-size" >
                            I was born and raised in Johannesburg, South Africa. From an early age I always had a eye for solving problems, and a pure love of sport. In the early years of High School I decided that I wanted to pursue tennis in order to get a scholarship in the United States to play tennis and study Computer Science. I ended my Junior tennis career ranked 18 in South Africa and 1253 in the world. This gave me the oppurtunity to play and study at Yeshiva University, where I have been a student since since August 2018.
                        </p>
                    </div>
                </v-sheet>
            </v-flex>
        </v-layout>

        <v-layout row style="margin-top:100px ; margin-bottom:50px">
            <v-flex md6>
                <v-img src="/NewYork.jpeg" style="width:70% ; margin-left:150px ; margin-top:15px"></v-img>
            </v-flex>
            <v-flex md6>
                <v-sheet
                    height=345px
                    color="white"
                    width = "80%"
                    elevation = "7"
                >
                    <div style="margin-top:15px">
                        <h1 class="text-md-center , font-weight-light ,font " style="margin-bottom:25px ;color:#0c494e ;"> Experience</h1>
                        <p class="text-md-center , font-weight-light , font-and-size" >
                            Excluding the projects I have done in my Data Structures, Computer Organization and Operating Systems classes I have had experience in the real world. I worked at a Web Dev company where I learned multiple front-end languages and design patterns. My most recent experience is as a DevOps Engineer intern. This experience gave me a crucial insight into AWS, Kubernetes, Infrastructure Monitoring, Scalability and Maintanence. All of my previous experience, whether in the classroom or 'real world', has enabled me to successfully create this project.
                        </p>
                    </div>
                </v-sheet>
            </v-flex>
        </v-layout>

        <v-layout row style="margin-top:100px ; margin-bottom:50px">
            <v-flex md6>
                <v-img src="/code.jpeg" style="width:70% ; margin-left:150px ; margin-top:15px"></v-img>
            </v-flex>
            <v-flex md6>
                <v-sheet
                    height=345px
                    color="white"
                    width = "80%"
                    elevation = "7"
                >
                    <div style="margin-top:15px">
                        <h1 class="text-md-center , font-weight-light ,font " style="margin-bottom:25px ;color:#0c494e ;"> This Project</h1>
                        <p class="text-md-center , font-weight-light , font-and-size" >
                            This project idea was born in my Algorithms 1 class when we were studying Shortest Path Algorithms. When I learn something new I always try to create a real world scenario where it would work. Due to me having a deep understanding of the tennis world, I was able to find a practical problem that I could solve. Even though this solution is mainly theoretical as it doesn't account for other factors (ranking, player injury, defending points etc etc ), I plan to keep on working on it until it can be used in the real world. For this project I used Java and SpringBoot as my backend, while using VueJS, HTML and CSS as my frontend.
  
                        </p>
                        
                        
                    </div>
                </v-sheet>
            </v-flex>
        </v-layout>
    </v-main>
</template>

<script>
export default {
    
}
</script>

<style>
.font{
    
    font-family: 'Antic Didone';
    
  
}
.font-and-size{
    
    font-family: 'Antic Didone';
    font-size: 16px;
  
}
</style>