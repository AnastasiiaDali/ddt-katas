package store

import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result

class ManagerAppHub(
    private val storage: StorageRepository,
) {
    fun register(product: Product): Result<Unit, ErrorCode> =  Ok(storage.save(product))
}