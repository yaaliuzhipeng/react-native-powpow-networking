//
//  PowpowNetworking.swift
//  PowpowNetworking
//
//  Created by lzp on 2022/3/12.
//  Copyright © 2022 Facebook. All rights reserved.
//

@objc(PowpowNetworking)
class PowpowNetworking: NSObject {

    @objc(multiply:withB:withResolver:withRejecter:)
    func multiply(a: Float, b: Float, resolve:RCTPromiseResolveBlock,reject:RCTPromiseRejectBlock) -> Void {
        resolve(a*b)
    }
}
