# ComposeWebview

Kotlin/JVM WebView using `wry` (Rust) with Gobley/UniFFI bindings, plus a Compose Desktop wrapper.

## Modules

- `wrywebview` - Rust + Gobley bindings.
- `wrywebview-compose` - Compose `WryWebView` composable.
- `demo` - sample Compose app.

## Run the demo

```shell
./gradlew :demo:run
```

## Requirements

- Rust toolchain (`rustup` installed).
