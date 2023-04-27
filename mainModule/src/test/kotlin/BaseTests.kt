import org.junit.Test
import testConsts.expectedKotlinVersion
import kotlin.test.assertEquals

class BaseTests {

    @Test
    fun testKotlinVersion() {
        assertEquals(expectedKotlinVersion, KotlinVersion.CURRENT)
    }
}