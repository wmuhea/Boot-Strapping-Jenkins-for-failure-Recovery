pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('Gubignit-Job') {
    definition {
        cpsScm {
			scm {
				git {
					remote {
						url 'https://github.com/wmuhea/cicdlearning.git'
					}
					branch 'master'
				}
			}
        }
    }
}

pipelineJob('Gubignit-Job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/wmuhea/cicdlearning.git'
                    }
                    branch 'master'
                    scriptPath 'Jenkinsfile-docker' //this  is refferting to the second Jenkins file. By default
                }
            }
        }
    }
}

pipelineJob('Gubignit-Job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/wmuhea/cicdlearning.git'
                    }
                    branch 'master'
                    scriptPath 'Jenkinsfile-aws' //this  is refferting to the third Jenkins file. By default
                }
            }
        }
    }
}
