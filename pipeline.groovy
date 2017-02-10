buildPipelineView('myproject') {
    filterBuildQueue()
    filterExecutors()
    title('Pipeline')
    displayedBuilds(5)
    selectedJob('Build')
    alwaysAllowManualTrigger()
    showPipelineParameters()
    refreshFrequency(60)
}