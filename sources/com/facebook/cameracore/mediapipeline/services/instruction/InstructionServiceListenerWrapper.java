package com.facebook.cameracore.mediapipeline.services.instruction;

import X.AnonymousClass000;
import X.C198659fH;
import X.C198669fI;
import X.C198679fJ;
import X.C201179je;
import X.C201949l7;
import android.os.Handler;
import java.util.List;

public class InstructionServiceListenerWrapper {
    public final Handler mUIHandler = AnonymousClass000.A0A();

    public void hideInstruction() {
        this.mUIHandler.post(new C198679fJ(this));
    }

    public void setVisibleAutomaticInstruction(int i, List list, List list2, List list3) {
        this.mUIHandler.post(new C201179je(this, list, list2, list3));
    }

    public void showInstructionForToken(String str) {
        this.mUIHandler.post(new C198659fH(this));
    }

    public void showInstructionWithCustomText(String str) {
        this.mUIHandler.post(new C198669fI(this));
    }

    public InstructionServiceListenerWrapper(C201949l7 r2) {
    }
}
