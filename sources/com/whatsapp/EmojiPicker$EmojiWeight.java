package com.whatsapp;

import X.AnonymousClass4F8;
import X.C18300x5;
import java.util.Arrays;

public class EmojiPicker$EmojiWeight implements AnonymousClass4F8 {
    public float A00;
    public int[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) obj;
            if (Float.compare(emojiPicker$EmojiWeight.A00, this.A00) != 0 || !Arrays.equals(this.A01, emojiPicker$EmojiWeight.A01)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean AzC(Object obj) {
        return Arrays.equals(this.A01, (int[]) obj);
    }

    public void Bnr(float f) {
        this.A00 = f;
    }

    public int hashCode() {
        return (C18300x5.A04(Float.valueOf(this.A00)) * 31) + Arrays.hashCode(this.A01);
    }

    public EmojiPicker$EmojiWeight(int[] iArr, float f) {
        this.A01 = iArr;
        this.A00 = f;
    }

    public long B4B() {
        return -1;
    }

    public /* bridge */ /* synthetic */ Object B7y() {
        return this.A01;
    }

    public float BEU() {
        return this.A00;
    }
}
