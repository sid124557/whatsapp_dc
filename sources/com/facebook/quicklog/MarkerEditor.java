package com.facebook.quicklog;

public abstract class MarkerEditor {
    public static final int COLLECT_METADATA = 1;
    public static final int NO_METADATA = 0;

    public abstract MarkerEditor annotate(String str, double d);

    public abstract MarkerEditor annotate(String str, int i);

    public abstract MarkerEditor annotate(String str, long j);

    public abstract MarkerEditor annotate(String str, String str2);

    public abstract MarkerEditor annotate(String str, boolean z);

    public abstract MarkerEditor annotate(String str, double[] dArr);

    public abstract MarkerEditor annotate(String str, int[] iArr);

    public abstract MarkerEditor annotate(String str, long[] jArr);

    public abstract MarkerEditor annotate(String str, String[] strArr);

    public abstract MarkerEditor annotate(String str, boolean[] zArr);

    public abstract void markerEditingCompleted();

    public abstract MarkerEditor point(String str, String str2, long j);

    public abstract PointEditor pointEditor(String str);

    public abstract MarkerEditor pointWithMetadata(String str, String str2, long j);

    public abstract MarkerEditor withLevel(int i);

    public MarkerEditor point(String str, String str2) {
        point(str, str2, -1);
        return this;
    }

    public MarkerEditor pointWithMetadata(String str, String str2) {
        pointWithMetadata(str, str2, -1);
        return this;
    }

    public MarkerEditor point(String str, long j) {
        point(str, (String) null, j);
        return this;
    }

    public MarkerEditor pointWithMetadata(String str, long j) {
        pointWithMetadata(str, (String) null, j);
        return this;
    }

    public MarkerEditor point(String str) {
        point(str, (String) null);
        return this;
    }

    public MarkerEditor pointWithMetadata(String str) {
        pointWithMetadata(str, (String) null);
        return this;
    }
}
