package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass9WL;
import X.C153877cA;
import X.C195349Xk;

public enum XplatAssetType {
    Unknown(0),
    AREffect(1),
    Async(2),
    StyleTransferEffect(3),
    LegacyEffect(4),
    ARLink(5),
    Remote(6),
    FaceTrackerModel(7),
    HairSegmentationModel(8),
    SegmentationModel(9),
    TargetRecognitionModel(10),
    XRayModel(11),
    FittedExpressionTrackerModel(12),
    MSuggestionsCoreModel(13),
    NametagModel(14),
    PyTorchModel(15),
    Caffe2Model(16),
    MulticlassSegmentationModel(17),
    ScriptingPackage(18),
    Ocr2goCreditCardModel(19),
    RecognitionModel(20),
    AR3DObject(21),
    SparkVision(22),
    FittedExpressionTrackerRuntimeRigRetargetingConfig(23);
    
    public static final XplatAssetType[] cppValueToEnumArray = null;
    public final int mCppValue;

    /* access modifiers changed from: public */
    static {
        cppValueToEnumArray = new XplatAssetType[values().length];
        for (XplatAssetType xplatAssetType : values()) {
            cppValueToEnumArray[xplatAssetType.mCppValue] = xplatAssetType;
        }
    }

    public static XplatAssetType fromARRequestAsset(C195349Xk r3) {
        AnonymousClass9WL r32 = r3.A02;
        ARAssetType aRAssetType = r32.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal == 0) {
            return AREffect;
        }
        if (ordinal == 2) {
            return Async;
        }
        if (ordinal == 3) {
            return Remote;
        }
        if (ordinal == 4) {
            return ScriptingPackage;
        }
        if (ordinal == 1) {
            VersionedCapability A03 = r32.A03();
            C153877cA.A00(A03, "SUPPORT ARRequestAsset should have versioned capability field");
            return fromVersionedCapability(A03);
        }
        throw AnonymousClass000.A0E(aRAssetType, "Unknown ARRequestAsset type : ", AnonymousClass001.A0o());
    }

    public static XplatAssetType ofCppValue(int i) {
        if (i >= 0 && i < values().length) {
            return cppValueToEnumArray[i];
        }
        throw AnonymousClass001.A0c("Invalid cpp value for AssetType");
    }

    /* access modifiers changed from: public */
    XplatAssetType(int i) {
        this.mCppValue = i;
    }

    public static XplatAssetType fromVersionedCapability(VersionedCapability versionedCapability) {
        return versionedCapability.getXplatAssetType();
    }

    public int getValue() {
        return this.mCppValue;
    }
}
