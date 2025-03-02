/*
 * Copyright (c) 2022 Xilinx, Inc.
 * All rights reserved.
 *
 * Author Zac Blair, Xilinx Research Labs.
 *
 * This file is part of RapidWright.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.xilinx.rapidwright.design.noc;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumerates NOC Site Types.
 */
public enum ComponentType {
    PL_NMU,
    PL_NSU,
    PS_NMU,
    PS_NSU,
    PS_RPU,
    PS_NCI_NMU,
    PS_NCI_NSU,
    PS_CCI_NSU,
    PS_CCI_NMU,
    PMC_NMU,
    PMC_NSU,
    LPD_NMU,
    AIE_NMU,
    AIE_NSU,
    DDRC,
    PCIE_NMU,
    PCIE_NSU;

    private static Map<String,ComponentType> map;

    static {
        map = new HashMap<>();
        for(ComponentType e : values()) {
            map.put(e.toString(), e);
        }
    }

    public static ComponentType stringToValue(String s) {
        return map.get(s);
    }
}
