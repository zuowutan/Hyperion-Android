package com.willowtreeapps.hyperion.plugin.v1;

import android.content.Context;
import android.support.annotation.NonNull;

public interface OnApplicationForegroundListener {
    void onApplicationForeground(@NonNull Context context);
}