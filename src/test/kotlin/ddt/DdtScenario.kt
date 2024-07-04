package ddt

import store.ManagerAppHub

val scenario by lazy {
    when (System.getenv("DDT_CONFIG")) {
        else ->  newTestScenario(TestScenarioConfig.InMemory)
    }
}

enum class TestScenarioConfig {
    InMemory;
}

fun newTestScenario(config: TestScenarioConfig): DdtScenario = when (config) {
    TestScenarioConfig.InMemory -> {
        InMemoryScenario (
            managerHub = ManagerAppHub(
                storage = InMemoryStorageRepository,
            ),
        )
    }
}

abstract class DdtScenario {
    abstract fun newManagerActor() : ManagerActor
}

class InMemoryScenario (val managerHub: ManagerAppHub) : DdtScenario() {
    override fun newManagerActor(): ManagerActor {
        return InMemoryManagerActor(managerHub)
    }

}