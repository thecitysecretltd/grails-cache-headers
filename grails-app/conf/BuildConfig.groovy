if(System.getenv('TRAVIS_BRANCH')) {
    grails.project.repos.grailsCentral.username = System.getenv("GRAILS_CENTRAL_USERNAME")
    grails.project.repos.grailsCentral.password = System.getenv("GRAILS_CENTRAL_PASSWORD")    
}

grails.project.work.dir = 'target'

grails.project.repos.Harchvard.url = "http://artifactory/plugins-snapshot-local"
grails.project.repos.Harchvard.type = "maven"
grails.project.repos.Harchvard.username = "admin"
grails.project.repos.Harchvard.password = "password"

grails.project.repos.HarchvardRelease.url = "http://artifactory/plugins-release-local"
grails.project.repos.HarchvardRelease.type = "maven"
grails.project.repos.HarchvardRelease.username = "admin"
grails.project.repos.HarchvardRelease.password = "password"

grails.project.repos.default = "Harchvard"

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	plugins {
		build ':release:3.0.1', ':rest-client-builder:2.0.1', {
			export = false
		}
	}
}
