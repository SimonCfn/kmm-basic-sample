// swift-tools-version:5.6
import PackageDescription

let package = Package(
    name: "KmmSample",
    platforms: [
        .iOS(.v14)
    ],
    products: [
        .library(
            name: "KmmSample",
            targets: ["KmmSample"]
        ),
    ],
    targets: [
        .binaryTarget(
            name: "KmmSample",
            path: "./build/XCFrameworks/release/KmmSample.xcframework"
        ),
    ]
)
