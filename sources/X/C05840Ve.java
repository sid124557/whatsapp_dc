package X;

import java.util.List;

/* renamed from: X.0Ve  reason: invalid class name and case insensitive filesystem */
public final class C05840Ve {
    public final float[] A00;
    public final int[] A01;

    public C05840Ve(int i, int i2, int i3) {
        this.A01 = new int[]{i, i2, i3};
        this.A00 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C05840Ve(List list, List list2) {
        int size = list.size();
        this.A01 = new int[size];
        this.A00 = new float[size];
        for (int i = 0; i < size; i++) {
            this.A01[i] = AnonymousClass000.A09(list, i);
            this.A00[i] = AnonymousClass001.A05(list2.get(i));
        }
    }

    public C05840Ve(int i, int i2) {
        this.A01 = new int[]{i, i2};
        this.A00 = new float[]{0.0f, 1.0f};
    }
}
