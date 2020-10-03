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