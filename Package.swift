// swift-tools-version:5.6
import PackageDescription

let package = Package(
    name: "MyCardKmm",
    platforms: [
        .iOS(.v14)
    ],
    products: [
        .library(
            name: "MyCardKmm",
            targets: ["MyCardKmm"]
        ),
    ],
    targets: [
        .binaryTarget(
            name: "MyCardKmm",
            path: "./build/XCFrameworks/release/MyCardKmm.xcframework"
        ),
    ]
)
