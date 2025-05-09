## NMSLib of About
NMSLib은 다양한 버전에서 사용 가능한 Native Minecraft Server 라이브러리입니다.<br>
NMSLib은 현재 **1.12 ~ 1.21.5**까지 지원합니다.<br>

## NMSLib of Comment
NMSLib의 일부 기능들은 테스트를 하지 않아서 작동이 되지 않을 수 있습니다.<br>

## NMSLib of Version
NMSLib은 현재 마인크래프트 버전으로 **1.12 ~ 1.21.5**까지 지원합니다.<br>
새로운 마인크래프트 버전들이 나오면 그에 맞춰 업데이트를 할 예정입니다.<br>

## NMSLib of Dependency
이 라이브러리를 기반으로 프로젝트를 구축하려면 `pom.xml`에 다음 참조 중 하나를 포함하기만 하면 됩니다:
```xml
<repository>
    <id>lone64 repository</id>
    <url>https://repo.repsy.io/mvn/lone64/everything/</url>
</repository>
```
이 라이브러리를 사용하려면 아래의 의존성을 등록해야 합니다:
```xml
<dependency>
    <groupId>dev.lone64</groupId>
    <artifactId>NMSLib</artifactId>
    <version>1.0.0</version>
</dependency>
```
<br>

## NMSLib of Example
```java
package dev.lone64.Example;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        // 아이템의 다양한 기능들이 포함되어 있습니다.
        NMSLib.getNMS().getNMSItem();

        // 아이템의 nbt를 관리할 수 있습니다.
        NMSLib.getNMS().loadItem(ItemStack);
        // 엔티티의 nbt를 관리할 수 있습니다.
        NMSLib.getNMS().loadEntity(Entity);

        // 아이템의 언어 이름을 가져옵니다. (현재는 영어, 한국어만 지원합니다.)
        String itemName = ItemUtil.getItemName(Plugin, Player, ItemStack);
    }
}
```