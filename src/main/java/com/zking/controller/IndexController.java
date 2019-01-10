package com.zking.controller;

import com.zking.model.Model;
import com.zking.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Index")
public class IndexController {

    @Autowired
    private ModelService modelService;




    /**
     * 跳转到业主信息页面
     */
    @RequestMapping("/toOwnerInformation")
    public String toOwnerInformation(){
        return "ownerManage/ownerInformation";
    }




    /**
     * 跳转到首页
     * @return
     */
    @RequestMapping("/toHome")
    public String toHome(){
        return "home";
    }


    /**
     * 首页查询示例
     * @return
     */
    @RequestMapping("/ModelList")
    @ResponseBody
    public  List<Model> ModelList(){
        List<Model> models = modelService.queryModel();
        return models;
    }



    /**
     * index根据ID查询子节点
     */

    @RequestMapping("/queryModelId")
    @ResponseBody
    public List<Model> queryModelId(@RequestParam String Id){
        List<Model> models = modelService.queryModelId(Id);
        return models;
    }

    /**
     * index左侧导航菜单
     * @return
     */
    @RequestMapping("/toIndex")
    @ResponseBody
    public List<Map<String, Object>> toIndex(){
        List<Model> maps = modelService.queryModel();
        List<Map<String, Object>> wu = transitionTreeGrid(maps, "-1");
        return wu;
    }

    public List<Map<String, Object>> transitionTreeGrid(List<Model> list, String id) {
        if (null == id || null == list || 0 == list.size())
            return null;
        List<Map<String, Object>> tree = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = null;
        for (Model module : list) {
            if (id.equals(module.getPid().toString())) {
                map = new HashMap<String, Object>();
                map.put("id", module.getId());
                map.put("pid", module.getPid());
                map.put("text", module.getText());
                map.put("url", module.getUrl());
                List<Map<String, Object>> transitionTreeGrid = transitionTreeGrid(list, module.getId());
                if (0 != transitionTreeGrid.size()) {
                    map.put("children", transitionTreeGrid);
                    map.put("state", "closed");
                }
                tree.add(map);
            }
        }
        return tree;
    }


}

